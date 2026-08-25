# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BundlePublishStatus(object):
    """
    Bundle publish status.
    """

    #: A constant which can be used with the status property of a BundlePublishStatus.
    #: This constant has a value of "SUCCEEDED"
    STATUS_SUCCEEDED = "SUCCEEDED"

    #: A constant which can be used with the status property of a BundlePublishStatus.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a BundlePublishStatus.
    #: This constant has a value of "IN_PROGRESS"
    STATUS_IN_PROGRESS = "IN_PROGRESS"

    #: A constant which can be used with the status property of a BundlePublishStatus.
    #: This constant has a value of "NOT_PUBLISHED"
    STATUS_NOT_PUBLISHED = "NOT_PUBLISHED"

    def __init__(self, **kwargs):
        """
        Initializes a new BundlePublishStatus object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param status:
            The value to assign to the status property of this BundlePublishStatus.
            Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_PUBLISHED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param time_started:
            The value to assign to the time_started property of this BundlePublishStatus.
        :type time_started: datetime

        :param time_completed:
            The value to assign to the time_completed property of this BundlePublishStatus.
        :type time_completed: datetime

        :param message:
            The value to assign to the message property of this BundlePublishStatus.
        :type message: str

        :param publish:
            The value to assign to the publish property of this BundlePublishStatus.
        :type publish: oci.aidataplatform_dp.models.BundlePublishLocation

        :param resources:
            The value to assign to the resources property of this BundlePublishStatus.
        :type resources: list[oci.aidataplatform_dp.models.BundlePublishedResource]

        """
        self.swagger_types = {
            'status': 'str',
            'time_started': 'datetime',
            'time_completed': 'datetime',
            'message': 'str',
            'publish': 'BundlePublishLocation',
            'resources': 'list[BundlePublishedResource]'
        }

        self.attribute_map = {
            'status': 'status',
            'time_started': 'timeStarted',
            'time_completed': 'timeCompleted',
            'message': 'message',
            'publish': 'publish',
            'resources': 'resources'
        }

        self._status = None
        self._time_started = None
        self._time_completed = None
        self._message = None
        self._publish = None
        self._resources = None

    @property
    def status(self):
        """
        **[Required]** Gets the status of this BundlePublishStatus.
        Publish status.

        Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_PUBLISHED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this BundlePublishStatus.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this BundlePublishStatus.
        Publish status.


        :param status: The status of this BundlePublishStatus.
        :type: str
        """
        allowed_values = ["SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_PUBLISHED"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def time_started(self):
        """
        **[Required]** Gets the time_started of this BundlePublishStatus.
        Publish start time.


        :return: The time_started of this BundlePublishStatus.
        :rtype: datetime
        """
        return self._time_started

    @time_started.setter
    def time_started(self, time_started):
        """
        Sets the time_started of this BundlePublishStatus.
        Publish start time.


        :param time_started: The time_started of this BundlePublishStatus.
        :type: datetime
        """
        self._time_started = time_started

    @property
    def time_completed(self):
        """
        **[Required]** Gets the time_completed of this BundlePublishStatus.
        Publish end time.


        :return: The time_completed of this BundlePublishStatus.
        :rtype: datetime
        """
        return self._time_completed

    @time_completed.setter
    def time_completed(self, time_completed):
        """
        Sets the time_completed of this BundlePublishStatus.
        Publish end time.


        :param time_completed: The time_completed of this BundlePublishStatus.
        :type: datetime
        """
        self._time_completed = time_completed

    @property
    def message(self):
        """
        Gets the message of this BundlePublishStatus.
        Publish summary.


        :return: The message of this BundlePublishStatus.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this BundlePublishStatus.
        Publish summary.


        :param message: The message of this BundlePublishStatus.
        :type: str
        """
        self._message = message

    @property
    def publish(self):
        """
        Gets the publish of this BundlePublishStatus.

        :return: The publish of this BundlePublishStatus.
        :rtype: oci.aidataplatform_dp.models.BundlePublishLocation
        """
        return self._publish

    @publish.setter
    def publish(self, publish):
        """
        Sets the publish of this BundlePublishStatus.

        :param publish: The publish of this BundlePublishStatus.
        :type: oci.aidataplatform_dp.models.BundlePublishLocation
        """
        self._publish = publish

    @property
    def resources(self):
        """
        Gets the resources of this BundlePublishStatus.
        Published resources.


        :return: The resources of this BundlePublishStatus.
        :rtype: list[oci.aidataplatform_dp.models.BundlePublishedResource]
        """
        return self._resources

    @resources.setter
    def resources(self, resources):
        """
        Sets the resources of this BundlePublishStatus.
        Published resources.


        :param resources: The resources of this BundlePublishStatus.
        :type: list[oci.aidataplatform_dp.models.BundlePublishedResource]
        """
        self._resources = resources

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
