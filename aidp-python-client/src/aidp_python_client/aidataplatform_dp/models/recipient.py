# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Recipient(object):
    """
    A Delta Share recipient can access the data assets in AI Data Platform Workbench through Delta Share Protocol.
    """

    #: A constant which can be used with the lifecycle_state property of a Recipient.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a Recipient.
    #: This constant has a value of "INACTIVE"
    LIFECYCLE_STATE_INACTIVE = "INACTIVE"

    def __init__(self, **kwargs):
        """
        Initializes a new Recipient object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this Recipient.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this Recipient.
        :type display_name: str

        :param description:
            The value to assign to the description property of this Recipient.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this Recipient.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Recipient.
        :type time_updated: datetime

        :param share_count:
            The value to assign to the share_count property of this Recipient.
        :type share_count: int

        :param created_by:
            The value to assign to the created_by property of this Recipient.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this Recipient.
        :type updated_by: str

        :param properties:
            The value to assign to the properties property of this Recipient.
        :type properties: dict(str, str)

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this Recipient.
            Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this Recipient.
        :type lifecycle_state_details: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'share_count': 'int',
            'created_by': 'str',
            'updated_by': 'str',
            'properties': 'dict(str, str)',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'share_count': 'shareCount',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'properties': 'properties',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._time_created = None
        self._time_updated = None
        self._share_count = None
        self._created_by = None
        self._updated_by = None
        self._properties = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this Recipient.
        Unique identifier for this recipient in AI Data Platform Workbench instance.


        :return: The key of this Recipient.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Recipient.
        Unique identifier for this recipient in AI Data Platform Workbench instance.


        :param key: The key of this Recipient.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this Recipient.
        A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.


        :return: The display_name of this Recipient.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Recipient.
        A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.


        :param display_name: The display_name of this Recipient.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this Recipient.
        Short description of the Recipient


        :return: The description of this Recipient.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Recipient.
        Short description of the Recipient


        :param description: The description of this Recipient.
        :type: str
        """
        self._description = description

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this Recipient.
        The date and time the Delta Share recipient was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this Recipient.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Recipient.
        The date and time the Delta Share recipient was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this Recipient.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Recipient.
        The date and time the Delta Share recipient was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this Recipient.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Recipient.
        The date and time the Delta Share recipient was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this Recipient.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def share_count(self):
        """
        **[Required]** Gets the share_count of this Recipient.
        The number of shares this recipient has access on.


        :return: The share_count of this Recipient.
        :rtype: int
        """
        return self._share_count

    @share_count.setter
    def share_count(self, share_count):
        """
        Sets the share_count of this Recipient.
        The number of shares this recipient has access on.


        :param share_count: The share_count of this Recipient.
        :type: int
        """
        self._share_count = share_count

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this Recipient.
        The ID of the user who created the recipient.


        :return: The created_by of this Recipient.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Recipient.
        The ID of the user who created the recipient.


        :param created_by: The created_by of this Recipient.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Recipient.
        The ID of the user who last updated the recipient.


        :return: The updated_by of this Recipient.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Recipient.
        The ID of the user who last updated the recipient.


        :param updated_by: The updated_by of this Recipient.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def properties(self):
        """
        Gets the properties of this Recipient.
        Key-value pair representing a defined tag key and value.
        Example: `{ \"CostCenter\": \"42\" }`


        :return: The properties of this Recipient.
        :rtype: dict(str, str)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this Recipient.
        Key-value pair representing a defined tag key and value.
        Example: `{ \"CostCenter\": \"42\" }`


        :param properties: The properties of this Recipient.
        :type: dict(str, str)
        """
        self._properties = properties

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this Recipient.
        The state of the recipient.

        Allowed values for this property are: "ACTIVE", "INACTIVE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this Recipient.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this Recipient.
        The state of the recipient.


        :param lifecycle_state: The lifecycle_state of this Recipient.
        :type: str
        """
        allowed_values = ["ACTIVE", "INACTIVE"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this Recipient.
        A message describing the current state in more detail.


        :return: The lifecycle_state_details of this Recipient.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this Recipient.
        A message describing the current state in more detail.


        :param lifecycle_state_details: The lifecycle_state_details of this Recipient.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
