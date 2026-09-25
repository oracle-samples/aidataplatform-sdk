# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntitySaveResult(object):
    """
    Result envelope for a bundled ontology entity save/autosave.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntitySaveResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param success:
            The value to assign to the success property of this OntologyEntitySaveResult.
        :type success: bool

        :param project_id:
            The value to assign to the project_id property of this OntologyEntitySaveResult.
        :type project_id: str

        :param base_revision:
            The value to assign to the base_revision property of this OntologyEntitySaveResult.
        :type base_revision: str

        :param revision:
            The value to assign to the revision property of this OntologyEntitySaveResult.
        :type revision: str

        :param current_revision:
            The value to assign to the current_revision property of this OntologyEntitySaveResult.
        :type current_revision: str

        :param client_mutation_id:
            The value to assign to the client_mutation_id property of this OntologyEntitySaveResult.
        :type client_mutation_id: str

        :param mode:
            The value to assign to the mode property of this OntologyEntitySaveResult.
        :type mode: str

        :param duplicate:
            The value to assign to the duplicate property of this OntologyEntitySaveResult.
        :type duplicate: bool

        :param applied_operation_ids:
            The value to assign to the applied_operation_ids property of this OntologyEntitySaveResult.
        :type applied_operation_ids: list[str]

        :param entity_results:
            The value to assign to the entity_results property of this OntologyEntitySaveResult.
        :type entity_results: list[oci.aidataplatform_dp.models.OntologyEntityOperationResult]

        :param failed_operation:
            The value to assign to the failed_operation property of this OntologyEntitySaveResult.
        :type failed_operation: oci.aidataplatform_dp.models.OntologyEntityFailedOperation

        :param error:
            The value to assign to the error property of this OntologyEntitySaveResult.
        :type error: oci.aidataplatform_dp.models.OntologyEntitySaveError

        """
        self.swagger_types = {
            'success': 'bool',
            'project_id': 'str',
            'base_revision': 'str',
            'revision': 'str',
            'current_revision': 'str',
            'client_mutation_id': 'str',
            'mode': 'str',
            'duplicate': 'bool',
            'applied_operation_ids': 'list[str]',
            'entity_results': 'list[OntologyEntityOperationResult]',
            'failed_operation': 'OntologyEntityFailedOperation',
            'error': 'OntologyEntitySaveError'
        }

        self.attribute_map = {
            'success': 'success',
            'project_id': 'projectId',
            'base_revision': 'baseRevision',
            'revision': 'revision',
            'current_revision': 'currentRevision',
            'client_mutation_id': 'clientMutationId',
            'mode': 'mode',
            'duplicate': 'duplicate',
            'applied_operation_ids': 'appliedOperationIds',
            'entity_results': 'entityResults',
            'failed_operation': 'failedOperation',
            'error': 'error'
        }

        self._success = None
        self._project_id = None
        self._base_revision = None
        self._revision = None
        self._current_revision = None
        self._client_mutation_id = None
        self._mode = None
        self._duplicate = None
        self._applied_operation_ids = None
        self._entity_results = None
        self._failed_operation = None
        self._error = None

    @property
    def success(self):
        """
        **[Required]** Gets the success of this OntologyEntitySaveResult.

        :return: The success of this OntologyEntitySaveResult.
        :rtype: bool
        """
        return self._success

    @success.setter
    def success(self, success):
        """
        Sets the success of this OntologyEntitySaveResult.

        :param success: The success of this OntologyEntitySaveResult.
        :type: bool
        """
        self._success = success

    @property
    def project_id(self):
        """
        **[Required]** Gets the project_id of this OntologyEntitySaveResult.

        :return: The project_id of this OntologyEntitySaveResult.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """
        Sets the project_id of this OntologyEntitySaveResult.

        :param project_id: The project_id of this OntologyEntitySaveResult.
        :type: str
        """
        self._project_id = project_id

    @property
    def base_revision(self):
        """
        Gets the base_revision of this OntologyEntitySaveResult.

        :return: The base_revision of this OntologyEntitySaveResult.
        :rtype: str
        """
        return self._base_revision

    @base_revision.setter
    def base_revision(self, base_revision):
        """
        Sets the base_revision of this OntologyEntitySaveResult.

        :param base_revision: The base_revision of this OntologyEntitySaveResult.
        :type: str
        """
        self._base_revision = base_revision

    @property
    def revision(self):
        """
        Gets the revision of this OntologyEntitySaveResult.

        :return: The revision of this OntologyEntitySaveResult.
        :rtype: str
        """
        return self._revision

    @revision.setter
    def revision(self, revision):
        """
        Sets the revision of this OntologyEntitySaveResult.

        :param revision: The revision of this OntologyEntitySaveResult.
        :type: str
        """
        self._revision = revision

    @property
    def current_revision(self):
        """
        Gets the current_revision of this OntologyEntitySaveResult.

        :return: The current_revision of this OntologyEntitySaveResult.
        :rtype: str
        """
        return self._current_revision

    @current_revision.setter
    def current_revision(self, current_revision):
        """
        Sets the current_revision of this OntologyEntitySaveResult.

        :param current_revision: The current_revision of this OntologyEntitySaveResult.
        :type: str
        """
        self._current_revision = current_revision

    @property
    def client_mutation_id(self):
        """
        **[Required]** Gets the client_mutation_id of this OntologyEntitySaveResult.

        :return: The client_mutation_id of this OntologyEntitySaveResult.
        :rtype: str
        """
        return self._client_mutation_id

    @client_mutation_id.setter
    def client_mutation_id(self, client_mutation_id):
        """
        Sets the client_mutation_id of this OntologyEntitySaveResult.

        :param client_mutation_id: The client_mutation_id of this OntologyEntitySaveResult.
        :type: str
        """
        self._client_mutation_id = client_mutation_id

    @property
    def mode(self):
        """
        Gets the mode of this OntologyEntitySaveResult.

        :return: The mode of this OntologyEntitySaveResult.
        :rtype: str
        """
        return self._mode

    @mode.setter
    def mode(self, mode):
        """
        Sets the mode of this OntologyEntitySaveResult.

        :param mode: The mode of this OntologyEntitySaveResult.
        :type: str
        """
        self._mode = mode

    @property
    def duplicate(self):
        """
        Gets the duplicate of this OntologyEntitySaveResult.

        :return: The duplicate of this OntologyEntitySaveResult.
        :rtype: bool
        """
        return self._duplicate

    @duplicate.setter
    def duplicate(self, duplicate):
        """
        Sets the duplicate of this OntologyEntitySaveResult.

        :param duplicate: The duplicate of this OntologyEntitySaveResult.
        :type: bool
        """
        self._duplicate = duplicate

    @property
    def applied_operation_ids(self):
        """
        Gets the applied_operation_ids of this OntologyEntitySaveResult.

        :return: The applied_operation_ids of this OntologyEntitySaveResult.
        :rtype: list[str]
        """
        return self._applied_operation_ids

    @applied_operation_ids.setter
    def applied_operation_ids(self, applied_operation_ids):
        """
        Sets the applied_operation_ids of this OntologyEntitySaveResult.

        :param applied_operation_ids: The applied_operation_ids of this OntologyEntitySaveResult.
        :type: list[str]
        """
        self._applied_operation_ids = applied_operation_ids

    @property
    def entity_results(self):
        """
        Gets the entity_results of this OntologyEntitySaveResult.

        :return: The entity_results of this OntologyEntitySaveResult.
        :rtype: list[oci.aidataplatform_dp.models.OntologyEntityOperationResult]
        """
        return self._entity_results

    @entity_results.setter
    def entity_results(self, entity_results):
        """
        Sets the entity_results of this OntologyEntitySaveResult.

        :param entity_results: The entity_results of this OntologyEntitySaveResult.
        :type: list[oci.aidataplatform_dp.models.OntologyEntityOperationResult]
        """
        self._entity_results = entity_results

    @property
    def failed_operation(self):
        """
        Gets the failed_operation of this OntologyEntitySaveResult.

        :return: The failed_operation of this OntologyEntitySaveResult.
        :rtype: oci.aidataplatform_dp.models.OntologyEntityFailedOperation
        """
        return self._failed_operation

    @failed_operation.setter
    def failed_operation(self, failed_operation):
        """
        Sets the failed_operation of this OntologyEntitySaveResult.

        :param failed_operation: The failed_operation of this OntologyEntitySaveResult.
        :type: oci.aidataplatform_dp.models.OntologyEntityFailedOperation
        """
        self._failed_operation = failed_operation

    @property
    def error(self):
        """
        Gets the error of this OntologyEntitySaveResult.

        :return: The error of this OntologyEntitySaveResult.
        :rtype: oci.aidataplatform_dp.models.OntologyEntitySaveError
        """
        return self._error

    @error.setter
    def error(self, error):
        """
        Sets the error of this OntologyEntitySaveResult.

        :param error: The error of this OntologyEntitySaveResult.
        :type: oci.aidataplatform_dp.models.OntologyEntitySaveError
        """
        self._error = error

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
