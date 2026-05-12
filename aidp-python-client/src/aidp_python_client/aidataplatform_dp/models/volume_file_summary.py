# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class VolumeFileSummary(object):
    """
    Summary information of file in the volume
    """

    #: A constant which can be used with the type property of a VolumeFileSummary.
    #: This constant has a value of "FILE"
    TYPE_FILE = "FILE"

    #: A constant which can be used with the type property of a VolumeFileSummary.
    #: This constant has a value of "FOLDER"
    TYPE_FOLDER = "FOLDER"

    def __init__(self, **kwargs):
        """
        Initializes a new VolumeFileSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this VolumeFileSummary.
        :type path: str

        :param display_name:
            The value to assign to the display_name property of this VolumeFileSummary.
        :type display_name: str

        :param time_created:
            The value to assign to the time_created property of this VolumeFileSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this VolumeFileSummary.
        :type time_updated: datetime

        :param type:
            The value to assign to the type property of this VolumeFileSummary.
            Allowed values for this property are: "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param description:
            The value to assign to the description property of this VolumeFileSummary.
        :type description: str

        :param metadata:
            The value to assign to the metadata property of this VolumeFileSummary.
        :type metadata: dict(str, str)

        :param composite_etag:
            The value to assign to the composite_etag property of this VolumeFileSummary.
        :type composite_etag: str

        :param system_tags:
            The value to assign to the system_tags property of this VolumeFileSummary.
        :type system_tags: dict(str, dict(str, object))

        :param created_by:
            The value to assign to the created_by property of this VolumeFileSummary.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this VolumeFileSummary.
        :type created_by_name: str

        """
        self.swagger_types = {
            'path': 'str',
            'display_name': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'type': 'str',
            'description': 'str',
            'metadata': 'dict(str, str)',
            'composite_etag': 'str',
            'system_tags': 'dict(str, dict(str, object))',
            'created_by': 'str',
            'created_by_name': 'str'
        }

        self.attribute_map = {
            'path': 'path',
            'display_name': 'displayName',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'type': 'type',
            'description': 'description',
            'metadata': 'metadata',
            'composite_etag': 'compositeEtag',
            'system_tags': 'systemTags',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName'
        }

        self._path = None
        self._display_name = None
        self._time_created = None
        self._time_updated = None
        self._type = None
        self._description = None
        self._metadata = None
        self._composite_etag = None
        self._system_tags = None
        self._created_by = None
        self._created_by_name = None

    @property
    def path(self):
        """
        **[Required]** Gets the path of this VolumeFileSummary.
        The fully qualified path of the volume file.
        Example: /Shared/Folder1/sample.csv


        :return: The path of this VolumeFileSummary.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this VolumeFileSummary.
        The fully qualified path of the volume file.
        Example: /Shared/Folder1/sample.csv


        :param path: The path of this VolumeFileSummary.
        :type: str
        """
        self._path = path

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this VolumeFileSummary.
        The name of the volume file. This will be the name of the file/folder in the volume.
        Example: sample.csv, Folder1


        :return: The display_name of this VolumeFileSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this VolumeFileSummary.
        The name of the volume file. This will be the name of the file/folder in the volume.
        Example: sample.csv, Folder1


        :param display_name: The display_name of this VolumeFileSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this VolumeFileSummary.
        The date and time the file was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this VolumeFileSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this VolumeFileSummary.
        The date and time the file was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this VolumeFileSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this VolumeFileSummary.
        The date and time the file was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this VolumeFileSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this VolumeFileSummary.
        The date and time the file was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this VolumeFileSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def type(self):
        """
        **[Required]** Gets the type of this VolumeFileSummary.
        The type of volume file.

        Allowed values for this property are: "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this VolumeFileSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this VolumeFileSummary.
        The type of volume file.


        :param type: The type of this VolumeFileSummary.
        :type: str
        """
        allowed_values = ["FILE", "FOLDER"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def description(self):
        """
        Gets the description of this VolumeFileSummary.
        The description for the file and folder.


        :return: The description of this VolumeFileSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this VolumeFileSummary.
        The description for the file and folder.


        :param description: The description of this VolumeFileSummary.
        :type: str
        """
        self._description = description

    @property
    def metadata(self):
        """
        Gets the metadata of this VolumeFileSummary.
        Metadata details of file or folder objects.


        :return: The metadata of this VolumeFileSummary.
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """
        Sets the metadata of this VolumeFileSummary.
        Metadata details of file or folder objects.


        :param metadata: The metadata of this VolumeFileSummary.
        :type: dict(str, str)
        """
        self._metadata = metadata

    @property
    def composite_etag(self):
        """
        Gets the composite_etag of this VolumeFileSummary.
        Etag combining data and metadata.


        :return: The composite_etag of this VolumeFileSummary.
        :rtype: str
        """
        return self._composite_etag

    @composite_etag.setter
    def composite_etag(self, composite_etag):
        """
        Sets the composite_etag of this VolumeFileSummary.
        Etag combining data and metadata.


        :param composite_etag: The composite_etag of this VolumeFileSummary.
        :type: str
        """
        self._composite_etag = composite_etag

    @property
    def system_tags(self):
        """
        Gets the system_tags of this VolumeFileSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this VolumeFileSummary.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this VolumeFileSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this VolumeFileSummary.
        :type: dict(str, dict(str, object))
        """
        self._system_tags = system_tags

    @property
    def created_by(self):
        """
        Gets the created_by of this VolumeFileSummary.
        OCID of the user who created this file.


        :return: The created_by of this VolumeFileSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this VolumeFileSummary.
        OCID of the user who created this file.


        :param created_by: The created_by of this VolumeFileSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this VolumeFileSummary.
        Name of the user who created this file.


        :return: The created_by_name of this VolumeFileSummary.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this VolumeFileSummary.
        Name of the user who created this file.


        :param created_by_name: The created_by_name of this VolumeFileSummary.
        :type: str
        """
        self._created_by_name = created_by_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
