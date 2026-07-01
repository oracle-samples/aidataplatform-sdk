# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateOntologyProjectDetails(object):
    """
    UpdateOntologyProjectDetails model.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateOntologyProjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this UpdateOntologyProjectDetails.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this UpdateOntologyProjectDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateOntologyProjectDetails.
        :type description: str

        :param namespace:
            The value to assign to the namespace property of this UpdateOntologyProjectDetails.
        :type namespace: str

        :param workspace_base_path:
            The value to assign to the workspace_base_path property of this UpdateOntologyProjectDetails.
        :type workspace_base_path: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this UpdateOntologyProjectDetails.
        :type lifecycle_state: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'namespace': 'str',
            'workspace_base_path': 'str',
            'lifecycle_state': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'namespace': 'namespace',
            'workspace_base_path': 'workspaceBasePath',
            'lifecycle_state': 'lifecycleState'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._namespace = None
        self._workspace_base_path = None
        self._lifecycle_state = None

    @property
    def key(self):
        """
        Gets the key of this UpdateOntologyProjectDetails.

        :return: The key of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this UpdateOntologyProjectDetails.

        :param key: The key of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateOntologyProjectDetails.

        :return: The display_name of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateOntologyProjectDetails.

        :param display_name: The display_name of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateOntologyProjectDetails.

        :return: The description of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateOntologyProjectDetails.

        :param description: The description of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._description = description

    @property
    def namespace(self):
        """
        Gets the namespace of this UpdateOntologyProjectDetails.

        :return: The namespace of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this UpdateOntologyProjectDetails.

        :param namespace: The namespace of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._namespace = namespace

    @property
    def workspace_base_path(self):
        """
        Gets the workspace_base_path of this UpdateOntologyProjectDetails.

        :return: The workspace_base_path of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._workspace_base_path

    @workspace_base_path.setter
    def workspace_base_path(self, workspace_base_path):
        """
        Sets the workspace_base_path of this UpdateOntologyProjectDetails.

        :param workspace_base_path: The workspace_base_path of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._workspace_base_path = workspace_base_path

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this UpdateOntologyProjectDetails.

        :return: The lifecycle_state of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this UpdateOntologyProjectDetails.

        :param lifecycle_state: The lifecycle_state of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._lifecycle_state = lifecycle_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
