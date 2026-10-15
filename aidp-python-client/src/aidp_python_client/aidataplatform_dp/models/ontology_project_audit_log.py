# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProjectAuditLog(object):
    """
    Audit log record for an ontology project.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProjectAuditLog object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action:
            The value to assign to the action property of this OntologyProjectAuditLog.
        :type action: str

        :param actor_id:
            The value to assign to the actor_id property of this OntologyProjectAuditLog.
        :type actor_id: str

        :param details:
            The value to assign to the details property of this OntologyProjectAuditLog.
        :type details: str

        :param opc_request_id:
            The value to assign to the opc_request_id property of this OntologyProjectAuditLog.
        :type opc_request_id: str

        :param time_created:
            The value to assign to the time_created property of this OntologyProjectAuditLog.
        :type time_created: datetime

        """
        self.swagger_types = {
            'action': 'str',
            'actor_id': 'str',
            'details': 'str',
            'opc_request_id': 'str',
            'time_created': 'datetime'
        }
        self.attribute_map = {
            'action': 'action',
            'actor_id': 'actorId',
            'details': 'details',
            'opc_request_id': 'opcRequestId',
            'time_created': 'timeCreated'
        }
        self._action = None
        self._actor_id = None
        self._details = None
        self._opc_request_id = None
        self._time_created = None

    @property
    def action(self):
        """
        **[Required]** Gets the action of this OntologyProjectAuditLog.
        Audited action, for example CREATE, UPDATE, or DELETE.


        :return: The action of this OntologyProjectAuditLog.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this OntologyProjectAuditLog.
        Audited action, for example CREATE, UPDATE, or DELETE.


        :param action: The action of this OntologyProjectAuditLog.
        :type: str
        """
        self._action = action

    @property
    def actor_id(self):
        """
        Gets the actor_id of this OntologyProjectAuditLog.
        Identity of the actor that performed the action. An OCI user OCID for recent rows; older rows may carry a serialized principal instead.


        :return: The actor_id of this OntologyProjectAuditLog.
        :rtype: str
        """
        return self._actor_id

    @actor_id.setter
    def actor_id(self, actor_id):
        """
        Sets the actor_id of this OntologyProjectAuditLog.
        Identity of the actor that performed the action. An OCI user OCID for recent rows; older rows may carry a serialized principal instead.


        :param actor_id: The actor_id of this OntologyProjectAuditLog.
        :type: str
        """
        self._actor_id = actor_id

    @property
    def details(self):
        """
        Gets the details of this OntologyProjectAuditLog.
        Human-readable description of the audited change.


        :return: The details of this OntologyProjectAuditLog.
        :rtype: str
        """
        return self._details

    @details.setter
    def details(self, details):
        """
        Sets the details of this OntologyProjectAuditLog.
        Human-readable description of the audited change.


        :param details: The details of this OntologyProjectAuditLog.
        :type: str
        """
        self._details = details

    @property
    def opc_request_id(self):
        """
        Gets the opc_request_id of this OntologyProjectAuditLog.
        Request id of the call that produced this record.


        :return: The opc_request_id of this OntologyProjectAuditLog.
        :rtype: str
        """
        return self._opc_request_id

    @opc_request_id.setter
    def opc_request_id(self, opc_request_id):
        """
        Sets the opc_request_id of this OntologyProjectAuditLog.
        Request id of the call that produced this record.


        :param opc_request_id: The opc_request_id of this OntologyProjectAuditLog.
        :type: str
        """
        self._opc_request_id = opc_request_id

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this OntologyProjectAuditLog.

        :return: The time_created of this OntologyProjectAuditLog.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this OntologyProjectAuditLog.

        :param time_created: The time_created of this OntologyProjectAuditLog.
        :type: datetime
        """
        self._time_created = time_created

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
