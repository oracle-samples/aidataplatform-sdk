# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RecipientSummary(object):
    """
    Summary information about a recipient.
    """

    #: A constant which can be used with the lifecycle_state property of a RecipientSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a RecipientSummary.
    #: This constant has a value of "INACTIVE"
    LIFECYCLE_STATE_INACTIVE = "INACTIVE"

    def __init__(self, **kwargs):
        """
        Initializes a new RecipientSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this RecipientSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this RecipientSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this RecipientSummary.
        :type description: str

        :param share_count:
            The value to assign to the share_count property of this RecipientSummary.
        :type share_count: int

        :param time_created:
            The value to assign to the time_created property of this RecipientSummary.
        :type time_created: datetime

        :param created_by:
            The value to assign to the created_by property of this RecipientSummary.
        :type created_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this RecipientSummary.
            Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this RecipientSummary.
        :type lifecycle_details: str

        :param updated_by:
            The value to assign to the updated_by property of this RecipientSummary.
        :type updated_by: str

        :param time_updated:
            The value to assign to the time_updated property of this RecipientSummary.
        :type time_updated: datetime

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'share_count': 'int',
            'time_created': 'datetime',
            'created_by': 'str',
            'lifecycle_state': 'str',
            'lifecycle_details': 'str',
            'updated_by': 'str',
            'time_updated': 'datetime'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'share_count': 'shareCount',
            'time_created': 'timeCreated',
            'created_by': 'createdBy',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_details': 'lifecycleDetails',
            'updated_by': 'updatedBy',
            'time_updated': 'timeUpdated'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._share_count = None
        self._time_created = None
        self._created_by = None
        self._lifecycle_state = None
        self._lifecycle_details = None
        self._updated_by = None
        self._time_updated = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this RecipientSummary.
        Unique identifier for this recipient in AI Data Platform Workbench instance.


        :return: The key of this RecipientSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this RecipientSummary.
        Unique identifier for this recipient in AI Data Platform Workbench instance.


        :param key: The key of this RecipientSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this RecipientSummary.
        A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.


        :return: The display_name of this RecipientSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this RecipientSummary.
        A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.


        :param display_name: The display_name of this RecipientSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this RecipientSummary.
        Short description of the Recipient


        :return: The description of this RecipientSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this RecipientSummary.
        Short description of the Recipient


        :param description: The description of this RecipientSummary.
        :type: str
        """
        self._description = description

    @property
    def share_count(self):
        """
        Gets the share_count of this RecipientSummary.
        The number of shares this recipient has access on.


        :return: The share_count of this RecipientSummary.
        :rtype: int
        """
        return self._share_count

    @share_count.setter
    def share_count(self, share_count):
        """
        Sets the share_count of this RecipientSummary.
        The number of shares this recipient has access on.


        :param share_count: The share_count of this RecipientSummary.
        :type: int
        """
        self._share_count = share_count

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this RecipientSummary.
        The date and time the Delta Share recipient was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this RecipientSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this RecipientSummary.
        The date and time the Delta Share recipient was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this RecipientSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this RecipientSummary.
        The ID of the user who created the recipient.


        :return: The created_by of this RecipientSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this RecipientSummary.
        The ID of the user who created the recipient.


        :param created_by: The created_by of this RecipientSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this RecipientSummary.
        The state of the recipient.

        Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this RecipientSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this RecipientSummary.
        The state of the recipient.


        :param lifecycle_state: The lifecycle_state of this RecipientSummary.
        :type: str
        """
        allowed_values = ["ACTIVE", "INACTIVE"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_details(self):
        """
        Gets the lifecycle_details of this RecipientSummary.
        A message describing the current state in more detail.


        :return: The lifecycle_details of this RecipientSummary.
        :rtype: str
        """
        return self._lifecycle_details

    @lifecycle_details.setter
    def lifecycle_details(self, lifecycle_details):
        """
        Sets the lifecycle_details of this RecipientSummary.
        A message describing the current state in more detail.


        :param lifecycle_details: The lifecycle_details of this RecipientSummary.
        :type: str
        """
        self._lifecycle_details = lifecycle_details

    @property
    def updated_by(self):
        """
        Gets the updated_by of this RecipientSummary.
        The ID of the user who last updated the recipient.


        :return: The updated_by of this RecipientSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this RecipientSummary.
        The ID of the user who last updated the recipient.


        :param updated_by: The updated_by of this RecipientSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def time_updated(self):
        """
        Gets the time_updated of this RecipientSummary.
        The date and time the Delta Share recipient was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this RecipientSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this RecipientSummary.
        The date and time the Delta Share recipient was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this RecipientSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
