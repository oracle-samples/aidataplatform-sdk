# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExportInferenceInvocationsDetails(object):
    """
    Destination, window, and filters for exporting correlated inference invocation records.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExportInferenceInvocationsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param volume_location:
            The value to assign to the volume_location property of this ExportInferenceInvocationsDetails.
        :type volume_location: str

        :param is_overwrite:
            The value to assign to the is_overwrite property of this ExportInferenceInvocationsDetails.
        :type is_overwrite: bool

        :param time_start:
            The value to assign to the time_start property of this ExportInferenceInvocationsDetails.
        :type time_start: datetime

        :param time_end:
            The value to assign to the time_end property of this ExportInferenceInvocationsDetails.
        :type time_end: datetime

        :param filters:
            The value to assign to the filters property of this ExportInferenceInvocationsDetails.
        :type filters: oci.aidataplatform_dp.models.ExportInferenceInvocationsFilters

        """
        self.swagger_types = {
            'volume_location': 'str',
            'is_overwrite': 'bool',
            'time_start': 'datetime',
            'time_end': 'datetime',
            'filters': 'ExportInferenceInvocationsFilters'
        }
        self.attribute_map = {
            'volume_location': 'volume_location',
            'is_overwrite': 'is_overwrite',
            'time_start': 'timeStart',
            'time_end': 'timeEnd',
            'filters': 'filters'
        }
        self._volume_location = None
        self._is_overwrite = None
        self._time_start = None
        self._time_end = None
        self._filters = None

    @property
    def volume_location(self):
        """
        **[Required]** Gets the volume_location of this ExportInferenceInvocationsDetails.
        Destination JSON file, as /Volumes/<catalog>/<schema>/<volume>/<path>.json. The caller must have write access to the destination volume. If the file already exists it is preserved and the export is written to a non-colliding name instead, unless is_overwrite is true. The path actually written is returned in the aidp-export-destination response header.


        :return: The volume_location of this ExportInferenceInvocationsDetails.
        :rtype: str
        """
        return self._volume_location

    @volume_location.setter
    def volume_location(self, volume_location):
        """
        Sets the volume_location of this ExportInferenceInvocationsDetails.
        Destination JSON file, as /Volumes/<catalog>/<schema>/<volume>/<path>.json. The caller must have write access to the destination volume. If the file already exists it is preserved and the export is written to a non-colliding name instead, unless is_overwrite is true. The path actually written is returned in the aidp-export-destination response header.


        :param volume_location: The volume_location of this ExportInferenceInvocationsDetails.
        :type: str
        """
        self._volume_location = volume_location

    @property
    def is_overwrite(self):
        """
        Gets the is_overwrite of this ExportInferenceInvocationsDetails.
        Whether an existing destination file may be replaced in place. Defaults to false, in which case the existing file is preserved and _copy is appended before the extension until the name is free; the resolved path is returned in the aidp-export-destination response header. The request is rejected only when the requested name and its first 10 generated alternatives are all taken.


        :return: The is_overwrite of this ExportInferenceInvocationsDetails.
        :rtype: bool
        """
        return self._is_overwrite

    @is_overwrite.setter
    def is_overwrite(self, is_overwrite):
        """
        Sets the is_overwrite of this ExportInferenceInvocationsDetails.
        Whether an existing destination file may be replaced in place. Defaults to false, in which case the existing file is preserved and _copy is appended before the extension until the name is free; the resolved path is returned in the aidp-export-destination response header. The request is rejected only when the requested name and its first 10 generated alternatives are all taken.


        :param is_overwrite: The is_overwrite of this ExportInferenceInvocationsDetails.
        :type: bool
        """
        self._is_overwrite = is_overwrite

    @property
    def time_start(self):
        """
        Gets the time_start of this ExportInferenceInvocationsDetails.
        Start of the exported publish-time window (RFC 3339, inclusive). Defaults to 30 days before timeEnd. The window must not exceed 30 days; export a longer history as consecutive windows. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.


        :return: The time_start of this ExportInferenceInvocationsDetails.
        :rtype: datetime
        """
        return self._time_start

    @time_start.setter
    def time_start(self, time_start):
        """
        Sets the time_start of this ExportInferenceInvocationsDetails.
        Start of the exported publish-time window (RFC 3339, inclusive). Defaults to 30 days before timeEnd. The window must not exceed 30 days; export a longer history as consecutive windows. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.


        :param time_start: The time_start of this ExportInferenceInvocationsDetails.
        :type: datetime
        """
        self._time_start = time_start

    @property
    def time_end(self):
        """
        Gets the time_end of this ExportInferenceInvocationsDetails.
        End of the exported publish-time window (RFC 3339, exclusive). Defaults to the current time. Must not be in the future. Body timestamps require millisecond precision. Example: 2026-10-01T00:00:00.000Z.


        :return: The time_end of this ExportInferenceInvocationsDetails.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this ExportInferenceInvocationsDetails.
        End of the exported publish-time window (RFC 3339, exclusive). Defaults to the current time. Must not be in the future. Body timestamps require millisecond precision. Example: 2026-10-01T00:00:00.000Z.


        :param time_end: The time_end of this ExportInferenceInvocationsDetails.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def filters(self):
        """
        Gets the filters of this ExportInferenceInvocationsDetails.

        :return: The filters of this ExportInferenceInvocationsDetails.
        :rtype: oci.aidataplatform_dp.models.ExportInferenceInvocationsFilters
        """
        return self._filters

    @filters.setter
    def filters(self, filters):
        """
        Sets the filters of this ExportInferenceInvocationsDetails.

        :param filters: The filters of this ExportInferenceInvocationsDetails.
        :type: oci.aidataplatform_dp.models.ExportInferenceInvocationsFilters
        """
        self._filters = filters

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
